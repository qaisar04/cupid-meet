package kz.baltabayev.userdetailsservice.mapper;

import kz.baltabayev.userdetailsservice.model.dto.UserInfoRequest;
import kz.baltabayev.userdetailsservice.model.dto.UserInfoResponse;
import kz.baltabayev.userdetailsservice.model.entity.UserInfo;
import kz.baltabayev.userdetailsservice.model.types.PersonalityType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.Named;

@Mapper(componentModel = ComponentModel.SPRING)
public interface UserInfoMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    @Mapping(source = "personalityType", target = "personalityType", qualifiedByName = "stringToPersonalityType")
    UserInfo toEntity(UserInfoRequest request);

    @Mapping(source = "files", target = "files")
    UserInfoResponse toResponse(UserInfo userInfo);

    @Named("stringToPersonalityType")
    default PersonalityType stringToPersonalityType(String personalityType) {
        return PersonalityType.valueOf(personalityType.toUpperCase());
    }
}