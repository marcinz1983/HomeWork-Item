package pl.sda.maniek.homeworkitem.converter;

public interface Mapper <E , D>{

        D fromEntityToDto(E entity);

        E fromDtoToEntity(D dto);
    }

