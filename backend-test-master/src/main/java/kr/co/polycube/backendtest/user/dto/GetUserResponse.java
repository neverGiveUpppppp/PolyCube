package kr.co.polycube.backendtest.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetUserResponse {
    private Long id;
    private String name;

}
