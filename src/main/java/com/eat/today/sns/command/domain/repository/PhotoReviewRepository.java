package com.eat.today.sns.command.domain.repository;

import com.eat.today.sns.command.application.entity.PhotoReviewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoReviewRepository extends JpaRepository<PhotoReviewEntity, Integer> {
}
