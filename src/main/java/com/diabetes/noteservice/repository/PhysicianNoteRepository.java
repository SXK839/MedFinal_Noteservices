package com.diabetes.noteservice.repository;

import com.diabetes.noteservice.model.PhysicianNote;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PhysicianNoteRepository extends MongoRepository<PhysicianNote, String> {

	// Fetch all notes for a patient, latest visit first
	List<PhysicianNote> findByPatientIdOrderByVisitDateDesc(String patientId);
}