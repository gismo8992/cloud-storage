package commands;

public class ListRequest extends AbstractCommand{
    @Override
    public CommandType getType() {
        return CommandType.LIST_REQUEST;
    }
}
