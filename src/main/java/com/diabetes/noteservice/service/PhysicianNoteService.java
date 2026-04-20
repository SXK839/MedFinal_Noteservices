package com.diabetes.noteservice.service;

import com.diabetes.noteservice.model.PhysicianNote;
import com.diabetes.noteservice.repository.PhysicianNoteRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PhysicianNoteService {

	private final PhysicianNoteRepository repository;

	public PhysicianNoteService(PhysicianNoteRepository repository) {
		this.repository = repository;
	}

	// ✅ Add a physician note (current visit)
	public PhysicianNote addNote(PhysicianNote note) {
		note.setVisitDate(LocalDateTime.now());
		return repository.save(note);
	}

	// ✅ Delete a physician note by note ID
	public void deleteNote(String noteId) {
		repository.deleteById(noteId);
	}

	// ✅ View notes from previous visits (latest first)
	public List<PhysicianNote> getNotesByPatientId(String patientId) {
		return repository.findByPatientIdOrderByVisitDateDesc(patientId);
	}
}