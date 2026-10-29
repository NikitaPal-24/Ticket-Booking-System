package com.example.ticket_booking_system.entity;

import java.time.LocalDate;

import com.example.ticket_booking_system.Enum.MovieStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="movies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		private Long id;
		private String title;
		private String description;
		private String genre;
		private String language;
		private Integer duration;
		private LocalDate releaseDate; //LocalDate is a Inbuilt class for modern Date and Time. and we are making a has-a-relationship here. 
		private String certificate;
		
		@Enumerated(EnumType.STRING) //Enum is used for fixed set of constants.  by default enum is stored in the form of numbers in the database so to specify that our enum is String we wrote this. 
		private MovieStatus status; //A field whose data type is your custom enum (MovieStatus), not a generic String or int.
	
}
