package fuzs.blockrunner.neoforge.client;

import fuzs.blockrunner.BlockRunner;
import fuzs.blockrunner.client.BlockRunnerClient;
import fuzs.puzzleslib.api.client.core.v1.ClientModConstructor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = BlockRunner.MOD_ID, dist = Dist.CLIENT)
public class BlockRunnerNeoForgeClient {

    public BlockRunnerNeoForgeClient() {
        ClientModConstructor.construct(BlockRunner.MOD_ID, BlockRunnerClient::new);
    }
}
