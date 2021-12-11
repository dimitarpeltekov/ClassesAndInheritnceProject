package glacialExpedition.models.explorers;

public class GlacierExplorer extends BaseExplorer{
    private final static double GLACIER_EXPLORER_ENERGY = 40;



    public GlacierExplorer(String name) {
        super(name, GLACIER_EXPLORER_ENERGY);
    }
}
