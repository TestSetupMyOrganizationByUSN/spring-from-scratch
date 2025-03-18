package org.example.springfromscratch.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MovieResponse(BoxOfficeResult boxOfficeResult) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record BoxOfficeResult(
//            String boxofficeType,
//            String showRange,
            List<DailyBoxOffice> dailyBoxOfficeList
    ) {}
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record DailyBoxOffice(
//            String rnum,
//            String audiCnt,
//            String salesAcc,
//            String scrnCnt,
//            String rankInten,
//            String salesShare,
//            String salesAmt,
//            String salesChange,
//            String audiInten,
//            String audiChange,
//            String rankOldAndNew,
//            String salesInten,
//            String showCnt,
            String rank,
            String movieCd,
            String movieNm,
            String openDt,
            String audiAcc
    ) {}
}
