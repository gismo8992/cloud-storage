package commands;

import java.io.Serializable;

public abstract class AbstractCommand implements Serializable {
    public abstract CommandType getType();
}
