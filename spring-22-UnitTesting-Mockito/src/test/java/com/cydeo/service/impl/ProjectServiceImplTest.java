package com.cydeo.service.impl;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.entity.Project;
import com.cydeo.mapper.ProjectMapper;
import com.cydeo.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.NoSuchElementException;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProjectServiceImplTest {

    @Mock
    ProjectRepository projectRepository;

    @Mock
    ProjectMapper projectMapper;

    @InjectMocks
    ProjectServiceImpl projectService;


    @Test
    void getByProjectCode_Test(){

        //given
        when(projectRepository.findByProjectCode(anyString())).thenReturn(new Project()); // stubbing
        when(projectMapper.convertToDto(any(Project.class))).thenReturn(new ProjectDTO());

        //when
        ProjectDTO projectDTO = projectService.getByProjectCode(anyString());

        //then
        InOrder inOrder = inOrder(projectRepository, projectMapper);

        inOrder.verify(projectRepository).findByProjectCode(anyString());
        inOrder.verify(projectMapper).convertToDto(any(Project.class));

        assertNotNull(projectDTO);
    }

    @Test
    void getByProjectCode_ExceptionTest(){

        when(projectRepository.findByProjectCode("")).thenThrow(new NoSuchElementException("Project not found"));

        Throwable throwable = assertThrows(NoSuchElementException.class, () -> projectService.getByProjectCode(""));

        verify(projectRepository).findByProjectCode("");
        verify(projectMapper, never()).convertToDto(any(Project.class));

        assertEquals("Project not found", throwable.getMessage());
    }

}