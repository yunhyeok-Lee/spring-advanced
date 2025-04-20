package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Service;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank(message = "기존 비밀번호를 입력하세요.")
    private String oldPassword;
    @NotBlank(message = "새 비밀번호를 입력하세요.")
    @Size(min = 8, message = "새 비밀번호는 8자 이상이어야 합니다.")
    @Pattern(regexp = ".*\\d.*",message = "비밀번호에 숫자가 포함되어야 합니다.")
    @Pattern(regexp = ".*[A-Z].*", message = "비밀번호에 대문자가 포함되어야 합니다.")
    private String newPassword;
}
