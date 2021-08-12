package behavioral.pattern.command;

public class MenuOptions {
    ActionListenerCommand openCommand;
    ActionListenerCommand saveCommand;

    public MenuOptions(ActionListenerCommand openCommand, ActionListenerCommand saveCommand) {
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
    }

    public void clickOpen() {
        openCommand.execute();
    }

    public void clickSave() {
        saveCommand.execute();
    }
}
