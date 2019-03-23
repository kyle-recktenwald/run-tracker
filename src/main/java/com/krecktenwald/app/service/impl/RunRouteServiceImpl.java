/*
package com.krecktenwald.app.service.impl;

import com.krecktenwald.app.service.RunRouteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class RunRouteServiceImpl implements RunRouteService{

    @Autowired
    RunRouteRepository runRouteRepository;

    @Override
    public RunRouteDto getRunRouteById(Integer userId) {
        return UserConverter.entityToDto(userRepository.getOne(userId));
    }

    @Override
    public void saveUser(UserDto userDto) {
        userRepository.save(UserConverter.dtoToEntity(userDto));
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
    }

}
*/
