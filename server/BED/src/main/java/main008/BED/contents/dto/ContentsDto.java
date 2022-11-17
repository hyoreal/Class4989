package main008.BED.contents.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import main008.BED.contents.entity.Contents;
import main008.BED.users.dto.UsersDto;
import main008.BED.users.entity.Users;

public class ContentsDto {

    @Getter
    @AllArgsConstructor
    public static class Post {

        private String title;
        private Contents.Categories categories;
        private String details;
        private String tutorDetail;
        private String thumbnail;
    }

    @Getter
    @AllArgsConstructor
    public static class Patch {

    }

    @Getter
    @Builder
    @AllArgsConstructor
    public static class Response {

        private Long contentsId;
        private String title;
        private String thumbnail;
        private Contents.Categories categories;
        private UsersDto.UserResponseToHome users;
    }
}
