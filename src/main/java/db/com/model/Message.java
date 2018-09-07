package db.com.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private static final String CUSTOM_PATTERN = "yyyy-MM-dd HH:mm:ss";

    private long id;
    private String date;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal volume;
    //    @JsonProperty("value")
    private BigDecimal value;
    private BigDecimal open;
    private BigDecimal close;

}