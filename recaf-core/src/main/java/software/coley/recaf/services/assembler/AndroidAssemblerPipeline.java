package software.coley.recaf.services.assembler;

import jakarta.annotation.Nonnull;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

/**
 * Dalvik assembler pipeline implementation.
 *
 * @author Matt Coley
 */
@ApplicationScoped
public class AndroidAssemblerPipeline {
    public static final String SERVICE_ID = "dalvik-assembler";

    @Inject
    public AndroidAssemblerPipeline(@Nonnull AssemblerPipelineGeneralConfig generalConfig, @Nonnull AndroidAssemblerPipelineConfig config) {
        // TODO: Implement when dalvik assembler pipeline is implemented
    }
}
