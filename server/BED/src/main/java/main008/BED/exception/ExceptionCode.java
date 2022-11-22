package main008.BED.exception;

import lombok.Getter;


public enum ExceptionCode {
    USER_NOT_FOUND(404, "User not found"),

    USER_EXISTS(409, "User(Email) exists"),
    BAD_PRICE(400, "1,000원 단위로 입력해주세요."),
    OVER_PRICE(400, "50,000원 이하로 입력해주세요.");

    @Getter
    private final int statusCode;

    @Getter
    private final String message;

    ExceptionCode(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }
}
