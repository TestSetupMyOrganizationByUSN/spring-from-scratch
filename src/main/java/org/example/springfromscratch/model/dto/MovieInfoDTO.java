package org.example.springfromscratch.model.dto;

import java.util.List;

public record MovieInfoDTO(
        MovieDTO movie,
        List<String> nations,
        List<String> genres,
        List<String> directors,
        List<String> actors,
        long time
) {
}
