import static ratpack.groovy.Groovy.ratpack

ratpack {
    bindings {
        module(HolderModule)
    }
    handlers {
        prefix("with-value") {
            all {
                request.add(new Holder(value: "some string"))
                next()
            }
        }
        all ValueRenderingHandler
    }
}