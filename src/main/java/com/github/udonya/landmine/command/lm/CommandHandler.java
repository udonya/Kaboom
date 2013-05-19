package com.github.udonya.landmine.command.lm;

import com.github.udonya.landmine.LandMine;
import com.github.udonya.landmine.command.AbstractCommandHandler;

public class CommandHandler extends AbstractCommandHandler {

    public CommandHandler(LandMine plugin) {
        cmdName = "landmine";
        providedCmds.add(new ToggleCommand(cmdName, plugin));
        providedCmds.add(new HelpCommand(cmdName, plugin));
    }
}