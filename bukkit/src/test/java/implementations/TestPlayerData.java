package implementations;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.lauriethefish.betterportals.bukkit.player.IPlayerData;
import com.lauriethefish.betterportals.bukkit.portal.selection.ISelectionManager;
import com.lauriethefish.betterportals.bukkit.portal.IPortal;
import lombok.Getter;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Collections;

public class TestPlayerData implements IPlayerData {
    @Getter private final Player player;
    @Getter private int updateTimes = 0;

    @Inject
    public TestPlayerData(@Assisted Player player) {
        this.player = player;
    }

    @Override
    public @NotNull Collection<IPortal> getViewedPortals() {
        return Collections.emptyList();
    }

    @Override
    public @NotNull ISelectionManager getSelection() {return null;}

    @Override
    public void savePermanentData() { }

    @Override
    public void freezePortalViews() { }

    @Override
    public @NotNull YamlConfiguration getPermanentData() { return null;}

    @Override
    public void setSelection(@NotNull ISelectionManager selection) { }

    @Override
    public void onUpdate() {
        updateTimes++;
    }

    @Override
    public void onPluginDisable() {

    }

    @Override
    public void onLogout() {

    }
}
