import ratpack.handling.Context
import ratpack.handling.Handler

import javax.inject.Inject
import javax.inject.Provider

class ValueRenderingHandler implements Handler {

    private final Provider<Holder> holderProvider

    @Inject
    ValueRenderingHandler(Provider<Holder> holderProvider) {
        this.holderProvider = holderProvider
    }

    void handle(Context ctx) throws Exception {
        ctx.render holderProvider.get().value
    }

}
