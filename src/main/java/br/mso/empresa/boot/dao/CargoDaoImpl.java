package br.mso.empresa.boot.dao;

import org.springframework.stereotype.Repository;
import br.mso.empresa.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {
    
}
