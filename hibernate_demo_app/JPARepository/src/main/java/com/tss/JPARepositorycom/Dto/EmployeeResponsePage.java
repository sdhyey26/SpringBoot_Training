package com.tss.JPARepositorycom.Dto;

import java.util.List;

import com.tss.JPARepository.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeResponsePage {

	private List<Employee>  contents;
	private long totalElments;
	private int size;
	private boolean isLastPage;
	private int totalPages;
}
