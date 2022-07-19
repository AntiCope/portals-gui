package anticope.portalsgui.mixins;

import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

@Mixin(ClientPlayerEntity.class)
public class ClientPlayerEntityMixin {
    @Redirect(method = "updateNausea", at = @At(value = "FIELD", target = "Lnet/minecraft/client/MinecraftClient;currentScreen:Lnet/minecraft/client/gui/screen/Screen;"))
    private Screen updateNauseaGetCurrentScreenProxy(MinecraftClient client) {
        return null;
    }
}
