/**
 * 
 */
package com.sapient.resttraining.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.resttraining.entity.Member;

/**
 * @author admi
 *
 */
public interface MemberRepository extends JpaRepository<Member, Integer> {

}
