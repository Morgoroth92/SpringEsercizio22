package com.example.SpringEsercizio22.repositories;

import com.example.SpringEsercizio22.entities.UploadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UploadRepository extends JpaRepository<UploadEntity, Long> {
}
