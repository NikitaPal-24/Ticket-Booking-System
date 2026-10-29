package com.example.ticket_booking_system.dto;

import java.time.LocalDate;

import com.example.ticket_booking_system.Enum.MovieStatus;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieResponseDTO {
	
	private Long id;
	@NotBlank
	private String title;
	private String description;
	@NotBlank
	private String genre;
	@NotBlank
	private String language;
	@Positive
	private Integer duration;
	@NotBlank
	private LocalDate releaseDate;
	@NotBlank
	private String certificate;
	//for just display purpose not for database
	private MovieStatus status;

}
