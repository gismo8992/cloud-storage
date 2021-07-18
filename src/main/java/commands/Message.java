package commands;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class Message implements Serializable {
    private String content;
}