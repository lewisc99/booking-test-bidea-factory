package com.lewis.discount.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDiscount extends JpaRepository<UserDiscount, Integer> {
}
