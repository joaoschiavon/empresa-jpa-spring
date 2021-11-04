package br.mso.empresa.boot.dao;

import org.springframework.stereotype.Repository;

import br.mso.empresa.boot.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {
  
}
