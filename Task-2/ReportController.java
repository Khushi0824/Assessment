package Problems;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
    
    @Autowired
    private SearchService searchService;
    
    // Other methods...
    // You can use the searchService in other methods of the ReportController as needed
}
