package db.com.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private static final String CUSTOM_PATTERN = "yyyy-MM-dd HH:mm:ss";

    private long id;
    private String date;
    private double high;
    private double low;
    private double volume;
    private double value;
    private double open;
    private double close;

}