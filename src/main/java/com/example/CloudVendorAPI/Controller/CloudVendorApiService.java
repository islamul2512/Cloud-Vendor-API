package com.example.CloudVendorAPI.Controller;

import com.example.CloudVendorAPI.models.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorApiService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudVendor;
                //new CloudVendor("c1","73xxxx3006","islam","gadhwa");
    }
    @PostMapping
    public String addCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "cloudVendor Added Successfully" ;
    }
    @PutMapping
    public String putCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "cloudVendor Updated Successfully" ;
    }
//    @DeleteMapping
//    public String deleteCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
//        this.cloudVendor = cloudVendor;
//        return "cloudVendor Deleted Successfully" ;
//    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "cloudVendor Deleted Successfully" ;
    }

}
