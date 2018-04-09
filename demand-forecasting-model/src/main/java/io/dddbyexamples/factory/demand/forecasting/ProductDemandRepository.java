package io.dddbyexamples.factory.demand.forecasting;

public interface ProductDemandRepository {
    ProductDemand get(String refNo);

    void save(ProductDemand model);

    void initNewProduct(String refNo);
}
