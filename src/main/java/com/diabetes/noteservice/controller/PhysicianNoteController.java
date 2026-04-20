package com.diabetes.noteservice.controller;

import com.diabetes.noteservice.model.PhysicianNote;
import com.diabetes.noteservice.service.PhysicianNoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Handles the Physician Note for patient
 */
@RestController
@RequestMapping("/notes")
public class PhysicianNoteController {

	private final PhysicianNoteService noteService;

	public PhysicianNoteController(PhysicianNoteService noteService) {
		this.noteService = noteService;
	}

	/**
	 * Add a physician note to a patient's history Sprint‑2 User Story: Add a Note
	 * to Patient’s History
	 */
	@PostMapping
	public PhysicianNote addNote(@RequestBody PhysicianNote note) {
		return noteService.addNote(note);
	}

	/**
	 * Delete a physician note Optional Sprint-2 / Extension Use Case
	 */
	@DeleteMapping("/{noteId}")
	public void deleteNote(@PathVariable String noteId) {
		noteService.deleteNote(noteId);
	}

	/**
	 * View notes from previous visits for a patient Sprint‑2 User Story: View
	 * Patient Notes
	 */
	@GetMapping("/patient/{patientId}")
	public List<PhysicianNote> getNotesByPatient(@PathVariable String patientId) {
		return noteService.getNotesByPatientId(patientId);
	}
}