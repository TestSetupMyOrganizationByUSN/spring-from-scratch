package org.example.springfromscratch.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MovieInfoResponse(MovieInfoResult movieInfoResult) {
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record MovieInfoResult(MovieInfo movieInfo) {}
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record MovieInfo(
            String showTm,
            List<Nation> nations,
            List<Genre> genres,
            List<Director> directors,
            List<Actor> actors
    ) {}

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Nation(String nationNm) {}
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Genre(String genreNm) {}
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Director(String peopleNm) {}
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Actor(String peopleNm) {}
}

/*
public record movieInfoResponse(
	MovieInfoResult movieInfoResult
) {
	public record MovieInfoResult(String source, MovieInfo movieInfo) {}
	public record MovieInfo(
			String movieNmOg,
			List<DirectorsItem> directors,
			List<ShowTypesItem> showTypes,
			List<NationsItem> nations,
			String movieNm,
			String movieCd,
			List<ActorsItem> actors,
			String prdtStatNm,
			String prdtYear,
			String typeNm,
			List<GenresItem> genres,
			List<CompanysItem> companys,
			String openDt,
			String showTm,
			List<AuditsItem> audits,
			String movieNmEn,
			List<StaffsItem> staffs
	) { }

	public record DirectorsItem(String peopleNm, String peopleNmEn) { }
	public record ShowTypesItem(String showTypeNm, String showTypeGroupNm) { }
	public record NationsItem(String nationNm) { }
	public record ActorsItem(String peopleNm, String cast, String castEn, String peopleNmEn) { }
	public record GenresItem(String genreNm) { }
	public record CompanysItem(String companyCd, String companyNm, String companyNmEn, String companyPartNm) { }
	public record AuditsItem(String auditNo, String watchGradeNm) { }
	public record StaffsItem(String peopleNm, String staffRoleNm, String peopleNmEn) { }
}

 */