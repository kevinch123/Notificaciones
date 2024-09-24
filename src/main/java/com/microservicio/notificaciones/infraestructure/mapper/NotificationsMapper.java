package com.microservicio.notificaciones.infraestructure.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;
import com.microservicio.notificaciones.domain.dto.Notifications;
import com.microservicio.notificaciones.infraestructure.entity.Notificaciones;

@Mapper(componentModel = "spring")
public interface NotificationsMapper {
    @Mappings({
        @Mapping(source = "idNotificacion", target= "id_notification"),
        @Mapping(source = "encabezado", target= "header"),
        @Mapping(source = "contenido", target= "content"),
        @Mapping(source = "tipoNotificacion", target= "notificationType"),
        @Mapping(source = "destinatario", target= "recipient"),
        @Mapping(source = "prioridad", target= "priority"),
        @Mapping(source = "estado", target= "status"),
        @Mapping(source = "fechaCreacion", target= "creationDate"),
        @Mapping(source = "fechaLectura", target= "readDate"),
        @Mapping(source = "fechaEntrega", target= "deliveryDate"),
    })

    Notifications toNotifications (Notificaciones notificaciones);
    List<Notifications> toNotifications (List<Notificaciones> notificaciones);

    @InheritInverseConfiguration
    @Mapping(target = "idNotificacion", ignore = true)
    @Mapping(target = "destinatario", ignore = true)
    @Mapping(target = "prioridad", ignore = true)
    @Mapping(target = "estado", ignore = true)
    @Mapping(target = "fechaCreacion", ignore = true)
    @Mapping(target = "fechaLectura", ignore = true)
    @Mapping(target = "fechaEntrega", ignore = true)
    Notificaciones toNotificaciones (Notifications notifications);
    List<Notificaciones> toNotificaciones (List<Notifications> notifications);

}
