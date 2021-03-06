package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharaTopRepository extends JpaRepository<Chara,Long> {
	List<Chara> findAllByOrderByBangAsc();
	List<Chara> findAllByOrderByCharFuriAsc();
	List<Chara> findAllByOrderByRareDesc();
	List<Chara> findAllByOrderByRareAsc();

}
