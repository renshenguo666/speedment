package com.company.sakila.db0.sakila.inventory.generated;

import com.company.sakila.db0.sakila.inventory.Inventory;
import com.company.sakila.db0.sakila.inventory.InventoryImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.common.injector.annotation.WithState;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.sql.SqlPersistenceComponent;
import com.speedment.runtime.core.component.sql.SqlStreamSupplierComponent;
import com.speedment.runtime.core.exception.SpeedmentException;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.company.sakila.db0.sakila.inventory.Inventory} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedInventorySqlAdapter {
    
    private final TableIdentifier<Inventory> tableIdentifier;
    
    protected GeneratedInventorySqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("db0", "sakila", "inventory");
    }
    
    @ExecuteBefore(RESOLVED)
    void installMethodName(@WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent, @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }
    
    protected Inventory apply(ResultSet resultSet) throws SpeedmentException {
        final Inventory entity = createEntity();
        try {
            entity.setInventoryId( resultSet.getInt(1)       );
            entity.setFilmId(      resultSet.getInt(2)       );
            entity.setStoreId(     resultSet.getShort(3)     );
            entity.setLastUpdate(  resultSet.getTimestamp(4) );
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    protected InventoryImpl createEntity() {
        return new InventoryImpl();
    }
}