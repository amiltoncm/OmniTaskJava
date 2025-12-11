package br.com.amxsystems.omnitask.api.mapper;

import br.com.amxsystems.omnitask.api.dto.TenantResponse;
import br.com.amxsystems.omnitask.domain.model.Tenant;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TenantMapper {
    TenantResponse toResponse(Tenant tenant);
}
