/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.8.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package construction.mod.dlm.api;

import construction.mod.dlm.model.ElementCreate;
import construction.mod.dlm.model.PrefabElement;
import java.util.UUID;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:35:49.961443426Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
@Validated
@Tag(name = "element", description = "the element API")
public interface ElementApi {

    /**
     * POST /element : Create a new element
     * Creates a new element in the database.
     *
     * @param elementCreate The element to create. (optional)
     * @return The element was created successfully. (status code 201)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     */
    @Operation(
        operationId = "createElement",
        summary = "Create a new element",
        description = "Creates a new element in the database.",
        responses = {
            @ApiResponse(responseCode = "201", description = "The element was created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PrefabElement.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request."),
            @ApiResponse(responseCode = "401", description = "Authorization information is missing or invalid.")
        },
        security = {
            @SecurityRequirement(name = "apiKey"),
            @SecurityRequirement(name = "bearer")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/element",
        produces = { "application/json" },
        consumes = "application/json"
    )
    
    ResponseEntity<PrefabElement> createElement(
        @Parameter(name = "ElementCreate", description = "The element to create.") @Valid @RequestBody(required = false) ElementCreate elementCreate
    );


    /**
     * GET /element : Get an element
     * Gets an element from the database.
     *
     * @param id A unique identifier for an element (required)
     * @return The element was retrieved successfully. (status code 200)
     *         or Bad request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or An element with the specified ID was not found. (status code 404)
     */
    @Operation(
        operationId = "getElement",
        summary = "Get an element",
        description = "Gets an element from the database.",
        responses = {
            @ApiResponse(responseCode = "200", description = "The element was retrieved successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PrefabElement.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad request."),
            @ApiResponse(responseCode = "401", description = "Authorization information is missing or invalid."),
            @ApiResponse(responseCode = "404", description = "An element with the specified ID was not found.")
        },
        security = {
            @SecurityRequirement(name = "apiKey"),
            @SecurityRequirement(name = "bearer")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/element",
        produces = { "application/json" }
    )
    
    ResponseEntity<PrefabElement> getElement(
        @Parameter(name = "id", description = "A unique identifier for an element", required = true, in = ParameterIn.PATH) @PathVariable("id") UUID id
    );

}
