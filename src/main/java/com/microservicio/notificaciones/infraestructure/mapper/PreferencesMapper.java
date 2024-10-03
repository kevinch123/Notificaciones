package com.microservicio.notificaciones.infraestructure.mapper;

import java.util.List;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.microservicio.notificaciones.domain.dto.Preferences;
import com.microservicio.notificaciones.infraestructure.entity.Preferencias;

@Mapper(componentModel= "spring")
public interface PreferencesMapper {
    @Mappings({
        @Mapping(source = "idPreferencias" ,target = "idPreferences"),
        @Mapping(source = "canalReceptor" ,target = "receiverChannel"),
        @Mapping(source = "idioma" ,target = "language"),
        @Mapping(source = "privacidad" ,target = "privacy"),
        @Mapping(source = "modoOscuro" ,target = "darkMode"),
    })

    Preferencias toPreferences (Preferencias preferencias);
    List<Preferences> toPreferences(List<Preferencias> preferencias);

    @InheritConfiguration
    Preferencias toPreferencias (Preferences preferences);
    List<Preferencias> toPreferencias(List<Preferences> preferences);

    
}
