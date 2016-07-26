import com.google.inject.AbstractModule
import com.google.inject.Provides
import ratpack.guice.RequestScoped
import ratpack.http.Request

class HolderModule extends AbstractModule {

    protected void configure() {
        bind(ValueRenderingHandler)
    }

    @RequestScoped
    @Provides
    Holder provideHolder(Request request) {
        request.get(Holder)
    }

}
