package com.example.thim4p2.repository;

import com.example.thim4p2.model.TypeProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITypeProduct extends JpaRepository<TypeProduct,Integer> {
}
