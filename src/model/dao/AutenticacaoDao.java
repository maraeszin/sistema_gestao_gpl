package model.dao;

import model.entidades.Perfil;
import model.entidades.Usuario;
import model.exception.NegocioException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import view.modelo.LoginDto;

import javax.swing.*;

public class AutenticacaoDao {

    private final UsuarioDao usuarioDao;

    public AutenticacaoDao() {
        this.usuarioDao = new UsuarioDao();
    }

    public boolean temPermissao(Usuario usuario) {
        try {
            permissao(usuario);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Usuário sem permissão!", 0);
            return false;
        }
    }

    private void permissao(Usuario usuario) {
        if (!Perfil.ADMIN.equals(usuario.getPerfil())) {
            throw new NegocioException("Sem permissão para realizar essa ação!");
        }
    }

    public Usuario login(LoginDto login) {
        Usuario usuario = usuarioDao.buscarUsuarioPeloUsuario(login.getUsuario());

        if (usuario == null || !usuario.isEstado()) {
            return null;
        }
        if (usuario.isEstado() && validaSenha(usuario.getSenha(), login.getSenha())) {
            return usuario;
        }
        return null;
    }

    private boolean validaSenha(String senhaUsuario, String senhaLogin) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        return passwordEncoder.matches(senhaLogin, senhaUsuario);
    }
}
