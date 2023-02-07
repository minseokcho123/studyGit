package com.example.demo.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.demo.domain.Member;

public class MemoryMemberRepositoryTest {
	MemoryMemberRepository repository = new MemoryMemberRepository();
	
	@AfterEach  
	public void afterEach() {
		repository.clearStore();
	}
	
	@Test
	public void save() {
		Member member = new Member();
		member.setName("chominseok");
		
		repository.save(member);
		
		Member result = repository.findById(member.getId()).get();
	}
	
	@Test
	public void findByName() {
		Member member1 = new Member();
		member1.setName("chominseok111");
		repository.save(member1);
		
		Member member2 = new Member();
		member2.setName("chominseok222");
		repository.save(member2);
		
		Member result = repository.findByName("chominseok111").get();
		
		assertThat(result).isEqualTo(member1);
	}
	
	@Test
	public void findAll() {
		Member member = new Member();
		member.setName("chominseok333");
		repository.save(member);
		
		Member member2 = new Member();
		member2.setName("chominseok444");
		repository.save(member2);
		
		List<Member> result = repository.findAll();
		
		System.out.println("result :: " + result);
	}
	
}
