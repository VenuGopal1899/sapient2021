package junit5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import junit5.Database;
import junit5.Service;

/**
 * 
 * Using when().thenReturn() and when().thenThrow()
 * @author admi
 *
 */

@ExtendWith(MockitoExtension.class)
class ServiceDatabaseIdTest {

    @Mock
    Database databaseMock;

    @Test
    public void ensureMockitoReturnsTheConfiguredValue() {

        // define return value for method getUniqueId()
        when(databaseMock.getUniqueId()).thenReturn(42);

        Service service = new Service(databaseMock);
        // use mock in test....
        assertEquals(service.toString(), "Using database with id: 42");
    }

}
