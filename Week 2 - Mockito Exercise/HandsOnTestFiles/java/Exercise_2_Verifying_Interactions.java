import org.example.ExternalApi;
import org.example.MyService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class Exercise_2_Verifying_Interactions {

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.fetchData();
        verify(mockApi).getData();
    }
}
