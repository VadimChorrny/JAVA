package org.example.repositories;

import org.example.entities.ProductEntity;
import org.example.entities.RoleEntity;
import org.example.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {


}
