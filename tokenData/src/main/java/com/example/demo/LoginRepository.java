package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Account, Long> {
	Account findByUsermailAndUserpass(String usermail, String password);
}
